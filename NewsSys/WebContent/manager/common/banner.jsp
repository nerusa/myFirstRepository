<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	pageContext.setAttribute("path", path);
%>
<%@ taglib prefix="c"  uri="http://java.sun.com/jsp/jstl/core"%>   
<%@ taglib uri="http://com.jzscce.page/tags" prefix="cl"%> 
<!-- 国际化步骤 -->
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt_rt"%>
<fmt:setLocale variant="variant" value="${language }" scope="session" />
<fmt:setBundle basename="proper" scope="session" />

<c:if test="${empty language}">
	<fmt:setLocale variant="variant" value="zh" scope="session" />
	<fmt:setBundle basename="proper" scope="session" />
</c:if>
<link rel="stylesheet" type="text/css" href="${path }/resources/css/common.css">
    

