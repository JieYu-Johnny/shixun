<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册界面</title>
</head>
<body>
<form action="RegisterServlet" method="post">
    用户名：<input type="text" id="userId" name="userName" placeholder="输入用户名" /><br>
    密码：<input type="password" id="pwdId1" name="pwdName1" placeholder="输入密码" /><br>
    密码：<input type="password" id="pwdId2" name="pwdName2" placeholder="再次输入密码" /><br>
    <button type="submit">注册</button>
</form>
</body>
</html>

