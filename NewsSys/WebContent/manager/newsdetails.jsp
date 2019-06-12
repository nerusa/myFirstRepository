<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="common/banner.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title><fmt:message key="newsdetails_title"></fmt:message></title>
<link rel="stylesheet" type="text/css" href="${path }/resources/css/common.css">
<script type="text/javascript">
	function del(id){
		if(confirm("<fmt:message key="newsdetails_delSure"></fmt:message>")){
			window.location.href="news?opt=delete&id="+id;
		}
	}
</script>
</head>
<body>
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td width="270"><img src="${path }/resources/images/logo.png" width="270"
				height="60" />
			</td>
			<td align="right">
				<div>
		<fmt:message key="newsdetails_welcome"></fmt:message>:[${userName }]&nbsp;&nbsp;[<a href="clazz?opt=loadClass"><fmt:message key="newsdetails_addnews"></fmt:message></a>]
		[<a href="news?opt=LoginOutSvt"><fmt:message key="newsdetails_loginout"></fmt:message></a>]
				</div></td>
		</tr>
	</table>

	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td bgcolor="#999999"><img src="${path }/resources/images/mstanfordAd01.jpg"
				width="778" height="334" />
			</td>
		</tr>
	</table>
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="5"></td>
		</tr>
	</table>
	
	
	
	
	
	
	
	
	
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="1" bgcolor="#D4D4D4">
		<cl:pages emptyMessage="没有新闻！" pageSize="2" pageList="${list }" pageFootStyle="1">
		<tr>
			<td bgcolor="#FFFFFF">
				<table cellspacing="0" cellpadding="5" align="Center" border="0"
					style="width:776px;border-collapse:collapse;">
					<tr>
						<td style="text-align: left"><span class="px14">
							<fmt:message key="newsdetails_newsTitle"></fmt:message>:${row.title }
						</span></td>
					</tr>
					<tr>
						<td style="text-align: left"><span class="px14">
							<fmt:message key="newsdetails_author"></fmt:message>：${row.author } &nbsp;
							
							<fmt:message key="newsdetails_readCount"></fmt:message>：${row.readCount } &nbsp;
							
						</span></td>
					</tr>
					<tr>
						<td style="text-align: left"><span class="px14" style="word-spacing:5px">
							&nbsp;&nbsp;&nbsp;&nbsp;${row.content } &nbsp;
						</span></td>
					</tr>
					<tr>
						<td style="text-align: left"><span class="px14">
							<fmt:message key="newsdetails_date"></fmt:message>：${row.addDate } &nbsp;
							<fmt:message key="newsdetails_source"></fmt:message>：${row.source } 
						</span></td>
					</tr>
					
				</table>
				<table width="776" border="0" cellspacing="0" cellpadding="5">
					<tr>
						<td align="right" class="px14"></td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td style="text-align: right">
				<a href="news?opt=newDetails&id=${row.id }"> <fmt:message key="newsdetails_upd"></fmt:message></a>
				<a href="javascript:del(${row.id })"><fmt:message key="newsdetails_del"></fmt:message> </a>
			</td>
		</tr>
		</cl:pages>
	</table>
	
	
	
	
	
	
	
	
 
	<table width="778" border="0" align="center" cellpadding="0"
		cellspacing="0">
		<tr>
			<td height="25" align="right"><fmt:message key="newsdetails_cpright"></fmt:message></td>
		</tr>
	</table>
</body>
</html>
