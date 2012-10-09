$(document).ready(function() {
    if ($('#logout_btn')) {
        $('#logout_btn').die("click");
        // 退出系统绑定事件
        $('#logout_btn').live("click", function() {
            var scripts = document.getElementsByTagName("script");
            var importAlertFlag = false;
            var src;
            for (var i = 0; i < scripts.length; ++i) {
                src = scripts[i].src;
                if (src.indexOf("jquery.alerts.js") > 0) {
                    importAlertFlag = true;
                    break;
                }
            }
            if (importAlertFlag) {
                confirm('确认要退出系统吗？', function(result) {
                    if (result) {
                        $('#logoutForm').attr("action", "ZZ0601Action_logout.action");
                        $('#logoutForm').submitExtB();
                    }
                });
            }
            else {
                if (confirm('确认要退出系统吗？')) {
                    $('#logoutForm').attr("action", "ZZ0601Action_logout.action");
                    $('#logoutForm').submitExtB();
                }
            }
        });
    }
});