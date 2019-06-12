<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="common/banner.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><fmt:message key="news_title"></fmt:message></title>

</head>
<body>
<table width="778" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="270"><img src="${path }/resources/images/logo.png" width="270" height="60" /></td>
    <td>&nbsp;</td>
  </tr>
</table>
<table width="778" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td width="15">&nbsp;</td>
    <td height="20"><a href="index.jsp"><fmt:message key="news_topPage"></fmt:message></a> &gt; <a href="#">${newss.name }</a></td>
  </tr>
</table>
<table width="778" border="0" align="center" cellpadding="0" cellspacing="1" bgcolor="#D4D4D4">
  <tr>
    <td bgcolor="#FFFFFF"><table width="776" border="0" cellspacing="0" cellpadding="0">
      <tr>
        <td width="15"  background="${path }/resources/images/bg.png" class="newsTitle">&nbsp;</td>
        <td height="40"  background="${path }/resources/images/bg.png" class="newsTitle">${newss.title }</td>
      </tr>
    </table>
      <table width="776" border="0" cellspacing="0" cellpadding="0">
        <tr height="20">
          <td width="15" class="newsFrom">&nbsp;</td>
          
          <td class="newsFrom"><fmt:message key="news_date"></fmt:message>：${newss.addDate } <fmt:message key="news_author"></fmt:message>：${newss.author } <fmt:message key="news_source"></fmt:message>：${newss.source } <fmt:message key="news_readCount"></fmt:message>：${newss.readCount }</td>
       
        </tr>
      </table>
      <table width="776" border="0" cellspacing="0" cellpadding="10">
        <tr>
          <td height="200" valign="top" class="newsContent">${newss.content }</td>
        </tr>
    </table></td>
  </tr>
</table>
<table width="778" border="0" align="center" cellpadding="0" cellspacing="0">
  <tr>
    <td height="25" align="right"><fmt:message key="news_cpright"></fmt:message></td>
  </tr>
</table>
</body>
</html>
