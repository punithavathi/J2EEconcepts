<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.5/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="style1.css">
</head>
<style>
.display
   {
    margin-bottom: 0px;
    border-right-width: 0px;
    border-top-width: 0px;
    width: 1366px;
    height:51px;
}
.test {
	font-weight: bold;
	font-size: xx-large;
	padding: 10px;
}

.blue {
	font-weight: bold;
	font-size: xx-large;
	background-color: yellow;
}

#emailid {
	float: right;
}

#name {
	padding: 10px
}

#m {
	float: right
}


</style>


<body>




	<div>
		<nav class="navbar navbar-inverse display">
		<div class="container-fluid">
			<div class="navbar-header">
				<a class="navbar-brand" href="#">Oauth</a>
			</div>
			<div>
				<ul class="nav navbar-nav">
					<li class="active"><a href="#">Home</a></li>
					<li class="dropdown"><a class="dropdown-toggle"
						data-toggle="dropdown" href="#">Dropdown<span class="caret"></span></a>
						<ul class="dropdown-menu">
							<li><a href="#">Inbox</a></li>
							<li><a href="#">Sendmail</a></li>
							<li><a href="#">spam</a></li>
						</ul></li>
					<li><a href="#">About</a></li>
					<li><a href="#">Contact</a></li>
				</ul>
				 <ul class="nav navbar-nav navbar-right">
        
        <li>
      <button type="button" class="btn btn-danger pull-right" style="margin-right: 5px;width: 119px;height: 48px;padding-top: 10px;padding-right: 20px;padding-left: 11px;border-top-width: 8px;border-bottom-width: 3px;padding-bottom: 9px;"><a href="index.html">Logout</a></button>
      </ul>
      
			</div>
		</div>
		</nav>
	</div>
	<div class="jumbotron" style="width:1366px;height:616px;margin-bottom:0px">
	<div class="container">
     <div id="name" style="color:Aqua"></div>
		<div id="img" style="align: right:"></div>
	</div>
	
	</div>
 
	<script>
		var obj = ${name}
			
		

		var name = obj.name;
		$("#name").append("<span> Welcome this page: " + obj.name + " </span>");
		$("#name").append("<span id='m'> " + obj.mailid + "</span>");
		$("#img").append("<img src="+obj.picture+" style='border-radius: 106px;float:right;width: 162px;height: 158px;'>");

		
		$("#name span").addClass(".test");
		$("#name span#m").addClass(".blue");
	</script>

</body>
</html>
