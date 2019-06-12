<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="common/banner.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><fmt:message key="login_title"></fmt:message></title>

</head>
<body>

<div class="logo" id=".logo"><img src="${path }/resources/images/logo.png"/><font color="#FF6600" size="-2">■</font>&nbsp;<font color="#999900" size="-2">■</font>&nbsp;<font color="#FFFFCC" size="-2">■</font>&nbsp;</div>
   
   <div class="zw" id=".zw"><br>
   <form action="${path }/users?opt=login" method="post">
&nbsp;&nbsp;
<fmt:message key="login_userName"></fmt:message>：<input name="userName" type="text" id="username" style="width:80px; height:14px; border:1px solid #EEEEEE;" maxlength="8">&nbsp;&nbsp;
<fmt:message key="login_passWord"></fmt:message>：<input name="passWord" type="password" id="password" style="width:80px; height:14px; border:1px solid #EEEEEE;" maxlength="16">
&nbsp;&nbsp;
<input type="submit" name="Submit" value='<fmt:message key="login_login"></fmt:message>'  style="width:70px; height:16px; border:1px solid #999999; color:#669900;" />
</form>
</div>

</body>
</html>
