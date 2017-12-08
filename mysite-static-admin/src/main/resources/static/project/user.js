/**
 * Created by ThrStones on 2017/12/4.
 */
$(function () {

    $("#nav-accordion").children().children('li a.active').removeClass("active");
    $("#nav-accordion").children().children().children('ul li.active').removeClass("active");
    $("#users").addClass("active");
    $("#user").parent().css("style", "display:block");
    $("#user").addClass("active");

    //1.初始化Table
    var oTable = new TableInit();
    oTable.Init();

    //2.初始化Button的点击事件
    var oButtonInit = new ButtonInit();
    oButtonInit.Init();


    // $("#btn_add").click(function () {
    //     $("#user_form").removeClass("div-none").addClass("div-block");
    // });

});

/*https://www.cnblogs.com/landeanfen/p/4976838.html
 * https://segmentfault.com/a/1190000009285548
 * http://blog.csdn.net/ning521513/article/details/60744749*/

var TableInit = function () {
    var oTableInit = new Object();
    //初始化Table
    oTableInit.Init = function () {
        $('#tb_user').bootstrapTable({
            url: '/user/userList',         //请求后台的URL（*）
            dataType: "json",
            method: 'get',                      //请求方式（*）
            toolbar: '#toolbar',                //工具按钮用哪个容器
            striped: true,                      //是否显示行间隔色
            cache: false,                       //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
            pagination: true,                   //是否显示分页（*）
            sort: "id",
            sortable: true,                     //是否启用排序
            sortOrder: "asc",                   //排序方式
            queryParams: oTableInit.queryParams,//传递参数（*）
            sidePagination: "server",           //分页方式：client客户端分页，server服务端分页（*）
            pageNumber: 1,                       //初始化加载第一页，默认第一页
            pageSize: 10,                       //每页的记录行数（*）
            pageList: [10, 20, 30, 50],            //可供选择的每页的行数（*）
            search: false,                       //是否显示表格搜索，此搜索是客户端搜索，不会进服务端，所以，个人感觉意义不大
            strictSearch: true,
            showColumns: true,                  //是否显示所有的列
            showRefresh: true,                  //是否显示刷新按钮
            minimumCountColumns: 2,             //最少允许的列数
            clickToSelect: true,                //是否启用点击选中行
            // height: 600,                        //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
            uniqueId: "id",                     //每一行的唯一标识，一般为主键列
            showToggle: true,                    //是否显示详细视图和列表视图的切换按钮
            cardView: false,                    //是否显示详细视图
            detailView: false,                   //是否显示父子表
            responseHandler: responseHandler,
            onClickRow:onClickRow,
            columns: [
                //     {
                //     checkbox: true
                // },
                {
                    field: 'id',
                    title: 'ID',
                    sortable: true
                }, {
                    field: 'name',
                    title: '姓名',
                    sortable: true
                }, {
                    field: 'userSex',
                    title: '性别',
                    formatter: function (value, row, index) {
                        if (value == true) {
                            return "男";
                        } else {
                            return "女";
                        }
                    }
                }, {
                    field: 'userEmail',
                    title: '邮箱'
                }, {
                    field: 'userQQ',
                    title: 'QQ'
                }, {
                    field: 'groupID',
                    title: '用户组'
                }, {
                    field: 'roleID',
                    title: '角色'
                }, {
                    field: 'userLastLoginIP',
                    title: '最后登陆IP'
                }, {
                    field: 'userLastLoginTime',
                    title: '最后登陆时间',
                    sortable: true,
                    //——修改——获取日期列的值进行转换
                    formatter: function (value, row, index) {
                        return changeDateFormat(value)
                    }
                }, {
                    field: 'userLock',
                    title: '是否锁定',
                    sortable: true,
                    formatter: function (value, row, index) {
                        if (value == false) {
                            return "<span style='color: red'>已锁定</span>";
                        } else {
                            return "正常使用";
                        }
                    }
                },
                // {
                //     field: 'operate',
                //     title: '操作',
                //     align: 'center',
                //     events: operateEvents,
                //     formatter: operateFormatter
                // }
                ]
        });
    };

    function responseHandler(res) {
        return {
            "rows": res.content,
            "total": res.totalElements
        };
    }

    function onClickRow(item, $element) {
        $.ajax({
            type: "GET",
            url: "/user/getUsrById.html",
            data: {id:item.id},
            timeout: 50000,
            cache: false,
            success: function (result) {
                $("#detail").html(result);
            },
            error: function () {
                $("#message").html("Request time out");
            }
        });
    }

//修改——转换日期格式(时间戳转换为datetime格式)
    function changeDateFormat(cellval) {
        var dateVal = cellval + "";
        if (cellval != null) {
            var date = new Date(parseInt(dateVal.replace("/Date(", "").replace(")/", ""), 10));
            var month = date.getMonth() + 1 < 10 ? "0" + (date.getMonth() + 1) : date.getMonth() + 1;
            var currentDate = date.getDate() < 10 ? "0" + date.getDate() : date.getDate();

            var hours = date.getHours() < 10 ? "0" + date.getHours() : date.getHours();
            var minutes = date.getMinutes() < 10 ? "0" + date.getMinutes() : date.getMinutes();
            var seconds = date.getSeconds() < 10 ? "0" + date.getSeconds() : date.getSeconds();

            return date.getFullYear() + "-" + month + "-" + currentDate + " " + hours + ":" + minutes + ":" + seconds;
        }
    }

    // function operateFormatter(value, row, index) {
    //     return [
    //         '<a class="using" href="javascript:void(0)" title="Remove">',
    //         '<i class="fa fa-check"></i>',
    //         '</a>&nbsp;&nbsp;&nbsp;&nbsp;',
    //         '<a class="upload" style="cursor: pointer" href="javascript:void(0)" title="Upload">',
    //         '<label style="cursor: pointer" for="'+row['adId']+'">',
    //         '<i class="fa fa-upload"></i>',
    //         '<input type="file" name="adUpload" style="display: none;" class="adUpload" id="'+row['adId']+'" >',
    //         '</label>',
    //         '</a>&nbsp;&nbsp;&nbsp;&nbsp;',
    //         '<a class="remove" href="javascript:void(0)" title="Using">',
    //         '<i class="fa fa-times"></i>',
    //         '</a>',
    //     ].join('');
    // }
    //
    // window.operateEvents = {
    //     'click .remove': function (e, value, row, index) {
    //         $.ajax({
    //             type : "POST",
    //             url : "/wadmin/ad/deleteAd",
    //             data : {
    //                 adId : row['adId']
    //             },
    //             dataType : 'JSON',
    //             success : function (data) {
    //                 if (data.result != 0) {
    //                     toastr.info("info", data.message);
    //                     return ;
    //                 }
    //                 toastr.success("success", '删除成功');
    //                 $("#table").bootstrapTable('remove', {
    //                     field: 'adId',
    //                     values: [row['adId']]
    //                 });
    //             }
    //         });
    //
    //         return false;
    //     },
    //     'click .using': function (e, value, row, index) {
    //         $.ajax({
    //             type : "POST",
    //             url : "/wadmin/ad/usingAd",
    //             data : {
    //                 adId : row['adId']
    //             },
    //             dataType : 'JSON',
    //             success : function (data) {
    //                 if (data.result != 0) {
    //                     toastr.info("info", data.message);
    //                     return ;
    //                 }
    //                 toastr.success("success", '使用该广告');
    //                 $("#table").bootstrapTable('refresh');
    //             }
    //         });
    //
    //         return false;
    //     },
    //     'click .upload': function (e, value, row, index) {
    //         $('.adUpload').fileupload({
    //             url : '/wadmin/ad/adUpload/adId/'+row['adId'],
    //             dataType: 'json',
    //             add: function (e, data) {
    //                 data.submit();
    //             },
    //             done: function (e, data) {
    //                 var response = data.result;
    //                 if (response.result != 0) {
    //                     toastr.error(response.message);
    //                     return false;
    //                 }
    //                 toastr.success("上传成功");
    //                 $("#table").bootstrapTable('refresh');
    //             }
    //         });
    //
    //         return false;
    //     }
    // };


    //得到查询的参数
    oTableInit.queryParams = function (params) {
        var temp = {   //这里的键的名字和控制器的变量名必须一直，这边改动，控制器也需要改成一样的
            limit: params.limit,   //页面大小
            offset: params.offset,  //页码
            sort: params.sort,      //排序列名
            sortOrder: params.order, //排位命令（desc，asc）

            name: $("#txt_search_name").val(),
            email: $("#txt_search_email").val(),
            qq: $("#txt_search_qq").val()
        };
        return temp;
    };
    return oTableInit;
};


var ButtonInit = function () {
    var oInit = new Object();
    var postdata = {};

    oInit.Init = function () {
        //初始化页面上面的按钮事件
    };

    return oInit;
};