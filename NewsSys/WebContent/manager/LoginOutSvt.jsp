<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="common/banner.jsp" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><fmt:message key="LoginOutSvt_title"></fmt:message></title>

</head>
<body>
<table width="778" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="270"><img src="${path }/resources/images//logo.png" width="270" height="60" /></td>
    <td align="right">
<div >
	<fmt:message key="LoginOutSvt_change"></fmt:message>：&nbsp;<a href="country?language=zh">中文</a>&nbsp;&nbsp;&nbsp;<a href="country?language=ja">日文</a>&nbsp;&nbsp;
    <fmt:message key="LoginOutSvt_loginPlease"></fmt:message>[<a  href="${path }/manager/login.jsp"><fmt:message key="LoginOutSvt_login"></fmt:message></a>]。

</div>

      </td>
  </tr>
</table>
    
   
<table width="778" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td bgcolor="#999999"><img src="${path }/resources/images//mstanfordAd01.jpg" width="778" height="334" /></td>
  </tr>
</table>
<table width="778" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="5"> 
        
      </td>
  </tr>
</table>
<table width="778" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#D4D4D4">
  <tr>
    <td bgcolor="#FFFFFF">
        <table cellspacing="0" cellpadding="5" align="Center" border="0" style="width:776px;border-collapse:collapse;">
	 <%-- <c:forEach var="news" items="${list }">--%>
		<cl:pages emptyMessage="没有新闻！" pageSize="2" pageList="${list }" pageFootStyle="1">
			<tr>
				<td>
	                <span class="px14">·
	                    <a  href="news?opt=loadNews&id=${row.id }">${row.title }</a></span>
	            </td>
			</tr>
	</cl:pages>
	<%-- </c:forEach>--%>
</table>
      <table width="776" border="0" cellspacing="0" cellpadding="5">
        <tr>
          <td align="right" class="px14">
          </td>
        </tr>
    </table></td>
  </tr>
</table>

<table width="778" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="25" align="right"><fmt:message key="LoginOutSvt_cpright"></fmt:message></td>
  </tr>
</table>
</body>
</html>
