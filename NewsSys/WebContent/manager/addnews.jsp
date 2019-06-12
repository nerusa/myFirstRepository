<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="common/banner.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title><fmt:message key="addnews_title"></fmt:message></title>

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
		<fmt:message key="addnews_loginPlease"></fmt:message>[<a href="login.jsp"><fmt:message key="addnews_login"></fmt:message></a>]
	</c:if>
					<c:if test="${userName!=null}">
		<fmt:message key="addnews_welcome"></fmt:message>:[${userName}]&nbsp;[<a href="LoginOutSvt"><fmt:message key="addnews_loginout"></fmt:message></a>]
	</c:if>

				</div>
			</td>
		</tr>
	</table>

	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="15">&nbsp;</td>
			<td height="20" class="px14"><a href="news?opt=loadList"><fmt:message key="addnews_topPage"></fmt:message></a></td>
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
	<form action="news?opt=addNews" method="post">
<%-- 	<form action="news?opt=loadNews&id=${list.id }" method="post"> --%>
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="1" bgcolor="#D4D4D4">
		
		<tr>
			<td bgcolor="#FFFFFF">
				<table cellspacing="0" cellpadding="5" align="Center" border="0"
					style="width:776px;border-collapse:collapse;">
					<tr>
						<td><fmt:message key="addnews_type"></fmt:message>
						<select name="classId">
								<c:forEach items="${clazzList }" var="clazz">
									<option value="${clazz.id }">${clazz.name }</option>
								</c:forEach>
						</select>
						</td>
						<td><fmt:message key="addnews_author"></fmt:message> <input name="author" type="text" /></td>
						<td><fmt:message key="addnews_source"></fmt:message> <input name="source" type="text" /></td>
					</tr>
					<tr>
						<td colspan="3"><fmt:message key="addnews_newsTitle"></fmt:message> <input name="title" type="text" /></td>
						
					</tr>
					<tr>
						<td colspan="3"><fmt:message key="addnews_date"></fmt:message> <input type="text" value="2011-01-04" name="addDate"/></td>
					</tr>
					<tr>
						<td colspan="3"><fmt:message key="addnews_content"></fmt:message>
							<textarea rows="5" cols="100" name="content"></textarea>
						</td>
					</tr>

					<tr>
						<td align="right" colspan="3"><input type="submit" value='<fmt:message key="addnews_add"></fmt:message>'/></td>
					</tr>
				</table>
			
				<table width="776" border="0" cellspacing="0" cellpadding="5">

				</table>
				
				</td>
		</tr>
		
	</table>
	</form>
<!-- </form> -->
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="25" align="right"><fmt:message key="addnews_cpright"></fmt:message></td>
		</tr>
	</table>
</body>
</html>
