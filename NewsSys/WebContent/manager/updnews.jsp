<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common/banner.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><fmt:message key="updnews_title"></fmt:message></title>
	
</head>
<body>
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="270"><img src="${path }/resources/images/logo.png" width="270"
				height="60" /></td>
			<td align="right">
				<div>
					<c:if test="${userName==null}">
		<fmt:message key="updnews_loginPlease"></fmt:message>[<a href="login.jsp"><fmt:message key="updnews_login"></fmt:message></a>]
	</c:if>
					<c:if test="${userName!=null}">
		<fmt:message key="updnews_welcome"></fmt:message>:[${userName}]&nbsp;[<a href="LoginOutSvt"><fmt:message key="updnews_loginout"></fmt:message></a>]
	</c:if>

				</div>
			</td>
		</tr>
	</table>
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="15">&nbsp;</td>
			<td height="20" class="px14"><a href="news?opt=loadList"><fmt:message key="updnews_topPage"></fmt:message></a></td>
		</tr>
	</table>
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td bgcolor="#999999"><img src="${path }/resources/images/mstanfordAd01.jpg"
				width="778" height="334" /></td>
		</tr>
	</table>
	
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="5"></td>
		</tr>
	</table>
	<form action="news?opt=updNews" method="post">
	<input type="hidden" name="n_id" value="${newss.id }">
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="1" bgcolor="#D4D4D4">
		
		<tr>
			<td bgcolor="#FFFFFF">
				<table cellspacing="0" cellpadding="5" align="Center" border="0"
					style="width:776px;border-collapse:collapse;">
					
					<tr>
						<td><fmt:message key="updnews_type"></fmt:message>
						<select name="classId">
								<c:forEach items="${clazzList }" var="clazz">
									<c:if test="${clazz.name==newss.name}">
										<option value="${clazz.id }" selected="selected">${clazz.name }</option>
									</c:if>
									<c:if test="${clazz.name!=newss.name}">
										<option value="${clazz.id }">${clazz.name }</option>
									</c:if>
								</c:forEach>
						</select>
						</td>
						<td><fmt:message key="updnews_author"></fmt:message><input name="author" type="text" value="${newss.author }"/></td>
						<td><fmt:message key="updnews_source"></fmt:message> <input name="source" type="text" value="${newss.source }"/></td>
					</tr>
					<tr>
						<td colspan="3"><fmt:message key="updnews_newsTitle"></fmt:message> <input name="title" type="text" value="${newss.title }"/></td>
						
					</tr>
					<tr>
						<td colspan="3"><fmt:message key="updnews_date"></fmt:message> <input type="text" value="${newss.addDate }" name="addDate"/></td>
					</tr>
					<tr>
						<td colspan="3"><fmt:message key="updnews_content"></fmt:message>
							<textarea rows="5" cols="100" name="content">${newss.content }</textarea>
						</td>
					</tr>
					
					<tr>
						<td align="right" colspan="3"><input type="submit" value='<fmt:message key="updnews_upd"></fmt:message>'></td>
					</tr>
				</table>
				<table width="776" border="0" cellspacing="0" cellpadding="5">

				</table></td>
		</tr>
	</table>
	</form>
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="25" align="right"><fmt:message key="updnews_cpright"></fmt:message></td>
		</tr>
	</table>

</body>
</html>
