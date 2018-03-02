<%@ page language="java" contentType="text/html; charset=UTf-8"
	pageEncoding="UTf-8"%>
<%@ page import="java.util.*"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LoraIndex Lora主页</title>
<link rel="stylesheet" href="css/style_all.css" type="text/css" media="screen" />
<!-- to choose another color scheme uncomment one of the foloowing stylesheets and wrap styl1.css into a comment -->
<link rel="stylesheet" href="css/style8.css" type="text/css" media="screen" />

<link rel="stylesheet" href="css/jquery-ui.css" type="text/css" media="screen" />

<link rel="stylesheet" href="ueditor/themes/default/ueditor.css" type="text/css" media="screen" />

<script type='text/javascript' src='js/all-ck.js'></script>
<script type='text/javascript' src='ueditor/editor_config.js'></script>
<script type='text/javascript' src='js/custom.js'></script>
</head>
<body>
	<div id="top">
		<div id="head">
			<h1 class="logo">LoraAS</h1>
			
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

					<h2 class="jquery_tab_title">快速入口</h2>

					<a class="dashboard_button button1" href="#"> <span
						class="dashboard_button_heading">面板</span> <span>编辑各种基本的设置和选项</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button2" href="#"> <span
						class="dashboard_button_heading">设置</span> <span>编辑各种先进的设置和选项</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button3" href="#"> <span
						class="dashboard_button_heading">应用</span> <span>添加和编辑应用程序</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button4" href="#"> <span
						class="dashboard_button_heading">脚本编辑器</span> <span>输入您的JavaScript和PHP脚本</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button5" href="#"> <span
						class="dashboard_button_heading">搜索</span> <span>基本和先进的搜索区</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button6" href="#"> <span
						class="dashboard_button_heading">废纸篓</span> <span>删除的项目和数据库条目</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button7" href="#"> <span
						class="dashboard_button_heading two_lines">内容管理器</span> <span>添加新的静态和动态内容</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button8" href="#"> <span
						class="dashboard_button_heading">文件</span> <span>文件和下载管理</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button9" href="#"> <span
						class="dashboard_button_heading two_lines">通讯管理</span> <span>添加和管理订阅电子报</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button10" href="#"> <span
						class="dashboard_button_heading two_lines">用户管理器</span> <span>添加和编辑用户设置</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button11" href="#"> <span
						class="dashboard_button_heading">画廊</span> <span>管理您的图片库</span>
					</a>
					<!--end dashboard_button-->

					<a class="dashboard_button button12" href="#"> <span
						class="dashboard_button_heading">帮助</span> <span>如何使用脚本教程</span>
					</a>
					<!--end dashboard_button-->

					<h2>ECMall 动态</h2>
					<div>
						<p>
							ECMall 2.2.1 发布，期待您参与测试。2010-09-28 <a href="">查看详情</a> <a href="">BUG反馈</a>
						</p>
						<p>
							ECMall 安全补丁，V2.1和V2.2用户务必更新！2010-07-19 <a href="">查看详情</a>
						</p>
					</div>
					<h2>一周动态</h2>
					<div>
						<table>
							<tr>
								<th class="specalt">新增会员数:</th>
								<td>3</td>
								<th class="specalt">新增店铺数/申请数:</th>
								<td>0/0</td>
							</tr>
							<tr>
								<th class="specalt">新增商品数:</th>
								<td>0</td>
								<th class="specalt">新增订单数:</th>
								<td>0</td>
							</tr>
						</table>
					</div>
					<div class="copyrights">
						Collect from <a href="http://www.cssmoban.com/">企业网站模板</a>
					</div>
					<h2>统计信息</h2>
					<div>
						<table>
							<tr>
								<th class="specalt">网关总数:</th>
								<td>3</td>
								<th class="specalt">当前网关ID:</th>
								<td>012</td>
							</tr>
							<tr>
								<th class="specalt">终端个数:</th>
								<td>29</td>
								<th class="specalt">终端ID:</th>
								<td>017</td>
							</tr>
							<!-- <tr>
								<th class="specalt"></th>
								<td></td>
							</tr> -->
						</table>
					</div>
					<h2>系统信息</h2>
					<div>
						<table>
							<tr>
								<th class="specalt">服务器操作系统:</th>
								<td>LORA AS</td>
								<th class="specalt">服务器:</th>
								<td>Apache/2.2.9 Tomacat8</td>
							</tr>
							<tr>
								<th class="specalt">JDK版本:</th>
								<td>5.2.6</td>
								<th class="specalt">MYSQL 版本:</th>
								<td>5.1.28-rc-community-log</td>
							</tr>
							<!-- <tr>
								<th class="specalt">ECMall 版本:</th>
								<td>2.2.1 20100928</td>
								<th class="specalt">安装日期:</th>
								<td>2017-08-09</td>
							</tr> -->
						</table>
					</div>
				</div>
				<!--end content-->

			</div>
			<!--end main-->

			<div id="sidebar">
				<ul class="nav">
					<li><a class="headitem item1" href="#">应用服务</a>
						<ul>
							<!-- ul items without this class get hiddden by jquery-->
							<li><a href="${pageContext.request.contextPath}/StateServlet">应用状态显示</a></li>
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
							<li>
							<a><%
								out.println("IP 地址 " + request.getRemoteAddr());
								%></a></li>
							<li><a ><% out.print("系统时间："+new java.text.SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())); %></a></li>
							<li><a></a></li> 
						</ul></li>
				</ul>

			</div>
			<!--end sidebar-->

		</div>
		<!--end bg_wrapper-->

		<div id="footer" style="color: #fff; text-align: center">
			More Templates <a href="http://www.cssmoban.com/" target="_blank"
				title="模板之家">模板之家</a> - Collect from <a
				href="http://www.cssmoban.com/" title="网页模板" target="_blank">网页模板</a>
		</div>
		<!--end footer-->

	</div>
	<!-- end top -->
</body>
</html>