<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<%@ page import="java.util.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>Lora应用状态显示</title>
<link rel="stylesheet" href="css/style_all.css" type="text/css"
	media="screen" />
<!-- to choose another color scheme uncomment one of the foloowing stylesheets and wrap styl1.css into a comment -->
<link rel="stylesheet" href="css/style8.css" type="text/css"
	media="screen" />


<link rel="stylesheet" href="css/jquery-ui.css" type="text/css"
	media="screen" />

<link rel="stylesheet" href="ueditor/themes/default/ueditor.css"
	type="text/css" media="screen" />

<script type='text/javascript' src='js/all-ck.js'></script>
<script type='text/javascript' src='ueditor/editor_config.js'></script>
<script type='text/javascript' src='js/custom.js'></script>

<style type="text/css">
	
		.paging li {
			 text-decoration: none;  /*去掉前面的圆点*/  
           	list-style: none;  
           	float: left;  
            border: 1px solid #4a4a4a;  
            color:#4a4a4a;
				}
			
			.paging  ul{
				list-style-type:none;
				list-style-position:outside;
				padding-left: 30px;
				}
				
			.paging  li a{
				 color:#4a4a4a;  
	            text-decoration: none;  
	            margin:0px;  
	            display: block;  
	            line-height:30px;   
	            text-align:center;  
				line-height:32px;
				width:130px;
				text-decoration:none;
				display:block;
				padding: 0 20px;
				outline:none;
				font-size:14px;
				}
				
			.paging li a:hover{
				display: block;
				padding-right: 15px;
				background-color:#999;
				font-size: 18px;
				}
				
			.paging .current a{
				background-color:#fff;
				}
				
			.Page{
				width: 100%;
				margin-left: 4%;
			}
</style>
</head>
<body>



	<div id="top">
		<div id="head">
			<h1 class="logo">Lora系统应用端</h1>

			<div class="head_memberinfo">
				<div class="head_memberinfo_logo">
					<span>1</span> <img src="images/unreadmail.png" alt="" />
				</div>

				<span class='memberinfo_span'> 欢迎 <a href="">管理员</a>
				</span> <span class='memberinfo_span'> <a href="">设置</a>
				</span> <span> <a href="login.html">登出</a>
				</span> <span class='memberinfo_span2'> <a href="">私信</a>
				</span>
			</div>
			<!--end head_memberinfo-->

		</div>
		<!--end head-->

		<div id="bg_wrapper">

			<div id="main">

				<div id="content">

					<div class="jquery_tab">

						<div class="content_block">
							<h2 class="jquery_tab_title">应用状态显示</h2>
							<div id="container">

								<table class="zebra">
									<caption>Lora--gateway</caption>
									<thead>
										<tr>
											<th>GwID</th>
											<th>GwEUI</th>
											<th>LastFRM</th>
											<th>SKEY</th>
											<th>Lat</th>
											<th>Long</th>
											<th>Alt</th>
											<th>Temp</th>
											<th>Batt</th>
											<th>Isonline</th>
											<th>IsValid</th>
										</tr>
									</thead>

									<%-- <%!int count;%>
									<%
										count = 0;
									%>
									<c:forEach var="row" items="${result.rows}">
										<%
											count += 1;
												if (count >= 10)
													//break;
										%> --%>
										<tbody>
											<c:forEach items="${requestScope.gatewaylist}" var='gateway'>
												<tr>
													<td>${gateway.gwid}</td>
													<td>${gateway.gweui}</td>
													<td>${gateway.lastfrm}</td>
													<td>${gateway.skey}</td>
													<td>${gateway.lat}</td>
													<td>${gateway.longi}</td>
													<td>${gateway.alt}</td>
													<td>${gateway.temp}</td>
													<td>${gateway.batt}</td>
													<td>${gateway.isOnline}</td>
													<td>${gateway.isValid}</td>
												</tr>
											</c:forEach>
									</tbody>
								</table>
								
								<div class="Page">				
									 <ul  class="paging">  
									        <li><a href="${pageContext.request.contextPath}/StateServlet?currentpage=1">第一页</a>	</li>  
									        <li><a href="${pageContext.request.contextPath}/StateServlet?currentpage=${requestScope.pager.currentPage-1 }">上一页: ${requestScope.pager.currentPage-1 }</a></li>  
									        <li><a >当前页为： ${requestScope.pager.currentPage}</a></li>  
									        <li><a >共有：${requestScope.pager.pageTotal} 页</a></li>  
									        <li><a href="${pageContext.request.contextPath}/StateServlet?currentpage=${requestScope.pager.currentPage+1 }">下一页: ${requestScope.pager.currentPage+1 }</a></li>     
									        <li><a href="${pageContext.request.contextPath}/StateServlet?currentpage=${requestScope.pager.lastPage }">最后一页</a></li>          
	    							</ul> 
								 
								</div>		
							</div>


				

							<h2>Informations and Settings</h2>
							<div class="content-box box-grey">
								<h4>Lorem ipsum</h4>
								<p>Dolor sit amet, consectetur adipisicing elit, sed do
									eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
								<h4>Commodo consequat</h4>
								<p>Dolor sit amet, consectetur adipisicing elit, sed do
									eiusmod tempor incididunt ut labore et dolore magna aliqua.</p>
							</div>

							<div class="content-box box2">
								<h4>Consectetur adipisicing</h4>
								<p>Elit, sed do eiusmod tempor incididunt ut labore et
									dolore magna aliqua. Ut enim ad minim veniam, quis nostrud
									exercitation ullamco laboris nisi ut aliquip ex ea commodo
									consequat.</p>
								<p>Duis aute irure dolor in reprehenderit in voluptate velit
									esse cillum dolore eu fugiat nulla pariatur.</p>
							</div>


						</div>
						<!--end content_block-->

					</div>
					<!-- end jquery_tab -->
					<div class="jquery_tab">

						<div class="content_block">
							<h2 class="jquery_tab_title">即时警告</h2>
							<form method="post" action="#tab2">
								<p>
									<label for="name">Name (small input field)</label> <input
										class="input-small" type="text" value="" name="name" id="name" />
								</p>

								<p>
									<label for="mail">E-Mail address (medium sized input
										field)</label> <input class="input-medium" type="text" value=""
										name="mail" id="mail" />
								</p>

								<p>
									<label for="url">Your Website (big input field)</label> <input
										class="input-big" type="text" value="" name="url" id="url" />
								</p>

								<p>
									<label for="flex">Flexfield (flexible input field,
										width depends on window size)</label> <input class="input-flex"
										type="text" value="" name="flex" id="flex" />
								</p>

								<p>
									<label for="date">Click into input field to choose date</label>
									<input class="input-small flexy_datepicker_input" type="text"
										value="__ / __ / ____" name="flexy_datepicker" id="date" />
								</p>

								<p>
									<label for="selectbox">This is a dropdown list</label> <select
										name="selectbox" id="selectbox">
										<option value="">Choose an option</option>
										<option value="1">Home</option>
										<option value="2">Member</option>
										<option value="3">Portfolio</option>
										<option value="4">Blog</option>
									</select>
								</p>

								<p>
									<label for="radiobutton1" class="inline">True</label> <input
										id="radiobutton1" name="radiobutton" type="radio" value="1"
										class="jquery_improved" checked="checked" /> <label
										for="radiobutton2" class="inline">False</label> <input
										id="radiobutton2" name="radiobutton" type="radio" value="2"
										class="jquery_improved" />
								</p>

								<p>
									<label for="checkbox1" class="inline">True</label> <input
										type="checkbox" value="1" name="checkbox1" id="checkbox1" />
									<label for="checkbox2" class="inline">False</label> <input
										type="checkbox" value="2" name="checkbox2" id="checkbox2" />
								</p>

								<p>
									<label for="textarea">Enter some Text</label>
									<textarea name="textarea" id="textarea" cols="60" rows="15"></textarea>
								</p>

								<p>
									<label for="textarea2">Enter some Text into the rich
										text editor</label>
									<textarea name="textarea" id="textarea2" class="richtext"
										cols="60" rows="15"></textarea>
								</p>

								<p>
									<input class="button" name="submit" type="submit"
										value="Submit" />
								</p>
							</form>

						</div>
						<!--end content_block-->

					</div>
					<!--end jquery tab-->

					<div class="jquery_tab">

						<div class="content_block">
							<h2 class="jquery_tab_title">Table Examples</h2>

							<table id="table_liquid" cellspacing="0">
								<caption>Table 3: Liquid Layout Example (always
									expands to maximum size)</caption>
								<tr>
									<th class="nobg">Liquid Table</th>
									<th>Category</th>
									<th>Tags</th>
									<th>Options</th>
								</tr>
								<tr>
									<th class="spec">Lorem ipsum dolor</th>
									<td>Blog post</td>
									<td>latin, blind copy</td>
									<td>none</td>
								</tr>
								<tr>
									<th class="specalt">About me</th>
									<td class="alt">Static content</td>
									<td class="alt">personal, information</td>
									<td class="alt">none</td>
								</tr>
								<tr>
									<th class="spec">Portfolio</th>
									<td>Portfolio entry</td>
									<td>project, graphic, web design</td>
									<td>none</td>

								</tr>
								<tr>
									<th class="specalt">A random Blog post</th>
									<td class="alt">Blog post</td>
									<td class="alt">random, post, fun</td>
									<td class="alt">none</td>
								</tr>

							</table>

							<table id="table_auto" cellspacing="0">
								<caption>Table 2: Flexible Layout Example (content of
									tables defines the width)</caption>
								<tr>
									<th class="nobg">Flexible Table</th>
									<th>Category</th>
									<th>Tags</th>
									<th>Options</th>
								</tr>
								<tr>
									<th class="spec">Lorem ipsum dolor</th>
									<td>Blog post</td>
									<td>latin, blind copy</td>
									<td>none</td>
								</tr>
								<tr>
									<th class="specalt">About me</th>
									<td class="alt">Static content</td>
									<td class="alt">personal, information</td>
									<td class="alt">none</td>
								</tr>
								<tr>
									<th class="spec">Portfolio</th>
									<td>Portfolio entry</td>
									<td>project, graphic, web design</td>
									<td>none</td>

								</tr>
								<tr>
									<th class="specalt">A random Blog post</th>
									<td class="alt">Blog post</td>
									<td class="alt">random, post, fun</td>
									<td class="alt">none</td>
								</tr>

							</table>

							<table id="table_fixed" cellspacing="0">
								<caption>Table 1: Fixed Layout Example</caption>
								<tr>
									<th scope="col" class="nobg">Fixed Table</th>

									<th scope="col">Category</th>
									<th scope="col">Tags</th>
									<th scope="col">Options</th>
								</tr>
								<tr>
									<th scope="row" class="spec">Lorem ipsum dolor</th>
									<td>Blog post</td>

									<td>latin, blind copy</td>
									<td>none</td>
								</tr>
								<tr>
									<th scope="row" class="specalt">About me</th>
									<td class="alt">Static content</td>
									<td class="alt">personal, information</td>

									<td class="alt">none</td>
								</tr>
								<tr>
									<th scope="row" class="spec">Portfolio</th>
									<td>Portfolio entry</td>
									<td>project, graphic, web design</td>
									<td>none</td>

								</tr>
								<tr>
									<th scope="row" class="specalt">A random Blog post</th>
									<td class="alt">Blog post</td>
									<td class="alt">random, post, fun</td>
									<td class="alt">none</td>
								</tr>

							</table>


						</div>
						<!--end content_block-->

					</div>
					<!--end jquery tab-->
					
					<div class="jquery_tab">

						<div class="content_block">
							<h2 class="jquery_tab_title">图新实例</h2>
						</div>

					</div>
					<!--end jquery tab-->


					<div class="jquery_tab">

						<div class="content_block">
							<h2 class="jquery_tab_title">Response Messages</h2>


							<div class="message success">
								<p>
									<strong>Success!</strong> Everything fine...
								</p>
							</div>
							<!-- end success -->
							<div class="message error">
								<p>
									<strong>Error!</strong> Something is wrong...
								</p>
							</div>
							<!-- end error  -->
							<div class="message warning">
								<p>
									<strong>Warning!</strong> Could not connect to the server...
								</p>
							</div>
							<!-- end warning  -->
							<div class="message tip">
								<p>
									<strong>Tip!</strong> Buy this template =)
								</p>
							</div>
							<!-- end tip  -->


							<h2>Closeable Response Messages</h2>
							<div class="message success closeable">
								<p>
									<strong>Success!</strong> Everything fine...
								</p>
							</div>
							<!-- end success -->
							<div class="message error closeable">
								<p>
									<strong>Error!</strong> Something is wrong...
								</p>
							</div>
							<!-- end error  -->
							<div class="message warning closeable">
								<p>
									<strong>Warning!</strong> Could not connect to the server...
								</p>
							</div>
							<!-- end warning  -->
							<div class="message tip closeable">
								<p>
									<strong>Tip!</strong> Buy this template =)
								</p>
							</div>
							<!-- end tip  -->


						</div>
						<!--end content_block-->

					</div>
					<!--end jquery tab-->

				</div>
				<!--end content-->

			</div>
			<!--end main-->

			<div id="sidebar">
				<ul class="nav">
					<li><a class="headitem item1" href="#">应用服务</a>
						<ul>
							<!-- ul items without this class get hiddden by jquery-->
							<li><a href="/StateServlet">应用状态显示</a></li>
							<li><a href="#">即时警告</a></li>
							<!-- <li><a href="home.html"></a></li>
							<li><a href="#"></a></li> -->
						</ul></li>
					<li><a class="headitem item2" href="#">网关设置</a>
						<ul>
							<li><a href="#">重复包消除</a></li>
							<li><a href="#">网关管理和选择</a></li>
							<!-- <li><a href="#"></a></li> -->
						</ul></li>
					<li><a class="headitem item4" href="#">数据分析</a>
						<ul>
							<li><a href="#">网关协议分析</a></li>
							<li><a href="#">流经网关数据分析</a></li>
							<li><a href="#">信号强度分析</a></li>
							<li><a href="#">使用信道分析</a></li>
							<li><a href="#">传输速率分析</a></li>
						</ul></li>
					<!-- <li><a class="headitem item5" href="#">站点搜索</a>
						<ul>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
						</ul></li>
					<li><a class="headitem item6" href="#"></a>
						<ul>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
							<li><a href="#"></a></li>
						</ul></li> -->
				</ul>
				<!--end subnav-->

				<div class="flexy_datepicker"></div>

				<ul>
					<li><a class="headitem item7" href="#">当前IP和时间</a>
						<ul>
							<li><a> <%
 	out.println("IP 地址 " + request.getRemoteAddr());
 %>
							</a></li>
							<li><a> <%
 	out.print("系统时间：" + new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date()));
 %>
							</a></li>
							<li><a></a></li>
						</ul></li>
				</ul>

			</div>
			<!--end sidebar-->

		</div>
		<!--end bg_wrapper-->

		<div id="footer"></div>
		<!--end footer-->

	</div>
	<!-- end top -->
</body>
</html>