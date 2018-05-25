<!DOCTYPE html>
<html>
<head lang="en">
    <title>Spring Boot Demo - FreeMarker</title>
    <link href="/css/index.css" rel="stylesheet">
    <script type="text/javascript" src="http://cdn.bootcss.com/jquery/2.1.1/jquery.min.js"></script>
    <script type="text/javascript" src="http://static.runoob.com/assets/qrcode/qrcode.min.js"></script>
</head>
<body>
<h2>登录页面<h2>
<#--

    <font>
        <#list userList as item>
            ${item!}<br />
        </#list>
    </font>
-->
    <hr>
    <div id="qrcode" style="width:200px; height:200px; margin-top:15px;"></div>微信登录

    <script type="text/javascript">
        var qrcode = new QRCode(document.getElementById("qrcode"), {
            width : 200,
            height : 200
        });

        function makeCode () {
            var elText = document.getElementById("text");

            if (!elText.value) {
                alert("Input a text");
                elText.focus();
                return;
            }

            qrcode.makeCode(elText.value);
        }

        qrcode.makeCode("${basepath}wx/authorize");

    </script>


</body>
</html>