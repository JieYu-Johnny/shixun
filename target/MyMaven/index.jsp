<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>登录界面</title>
</head>
<body>
<form action="LoginServlet" method="post">
    用户名：<input type="text" id="userId" name="userName" placeholder="输入用户名" /><br>
    密码：<input type="password" id="pwdId" name="pwdName" placeholder="输入密码" /><br>
    <button type="submit">登录</button><br>
    <a href="register.jsp">没有账号？先去注册</a>
</form>
</body>
</html>

