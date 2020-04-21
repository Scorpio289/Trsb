<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.linkToPython.Bean" %>
<!DOCTYPE html>
<html>
<head>

<style type="text/css">

body{
margin: 0 auto;
}


.top{
margin:0 auto;
min-width:100%;
background-color: #444444;
}



h1 {
font-family: "Courier New";
font-size: 40px;
text-align: center;
}

p{
font-family: "Courier New";
font-size: 20px;
text-align: center;
}

.frame{
margin:0 auto;
max-height:50%;
max-width:24%;
text-align:center;
border-style:solid;
border-radius: 40px;
}

.frame1{
margin:0 auto;
max-width:24%;
text-align:center;
border-style:solid;
border-radius: 40px;
}

.logo-bar{
margin:0 auto;
min-width:100%;
text-align:center;
}

.logo-img{
width:400px;
height:100px;
}

.b{
width:270px;
height:40px;
border-width:0px;
border-radius:3px;
background:#1E90FF;
cursor:pointer;
outline:none;
font-family:Microsoft YaHei;
color:white;
font-size:17px;
align:center;
}

.b:hover{
background:#5599F;
}

.up{
width:80px;
height:20px;
border-width:0px;
border-radius:2px;
background:#1E90FF;
cursor:pointer;
outline:none;
font-family:Microsoft YaHei;
color:white;
font-size:10px;
}

.up:hover{
background:#5599F;
}

.file{
position: relative;
display: inline-block;
border:1px solid #99D3F5;
border-radius:2px;
padding:2px 6px;
overflow: hidden;
color:#1E88C7;
text-decoration:none;
text-indent:0;
line-height:20px;
}

.file input{
position: absolute;
font-size:5px;
right: 0;
top: 0;
opacity:0;
}

.file hover{
background:#AADFFD;
border-color:#78C3F3;
color:#004974;
text-decoration:none;
}


</style>


<meta charset="utf-8">
<title>Determining Robustness</title>

<script>
    var nodesnum = 0;
	
    function func(){
      nodesnum = document.getElementById("nodesnum").value
    }
    
function test1(){
if(nodesnum==0){
alert("please choose a number!")
document.getElementById("run").action = "fortest.jsp"
document.getElementById("run").submit()
}else if(nodesnum==5){
alert("nodesnum is 5, please wait a second~")
document.getElementById("run").action = "for5.jsp"
document.getElementById("run").submit()
}else if(nodesnum==6){
alert("nodesnum is 6, please wait a second~")
document.getElementById("run").action = "for6.jsp"
document.getElementById("run").submit()
}else{
alert("nodesnum is 7, please wait a second~")
document.getElementById("run").action = "for7.jsp"
document.getElementById("run").submit()
}
}   
    
</script>

</head>
<body align="center">

<div class="top">	
&nbsp
</div>

<div>
&nbsp
</div>

<div class="logo-bar">
<img class="logo-img" src="./icon/logo.png" />
</div>

<h1>Determining Robustness</h1>

<p>CHOOSE A NUMBER: 
<select name="nodesnum" id="nodesnum" onchange="func()"> 
<option value="0">please choose</option> 
<option value="5">5</option> 
<option value="6">6</option> 
<option value="7">7</option> 
</select> 
</p>


<form action="FileUpload" name="one" enctype="multipart/form-data" method="post" target="myIframe">
	<p>
	Gragh file upload 
        <a class="file">File
        <input type="File" name="fileupload"/> 
        </a>
	<input type="submit" value="upload" class="up">
	<input type="reset" value="cancel" class="up">
	</p>
</form>


<div class="frame1">
<Iframe id="myIframe" name="myIframe" frameborder="0" height="30px"></Iframe>
</div>

<div>	
&nbsp
</div>

<form action="" name="run" id="run" method="post" target="Result">
<div class="logo-bar">
<button name="b" class="b" type="button" onclick="test1()" >Determine now!</button>
</div>
</form>

<div>
&nbsp
</div>

<div class="frame">
<Iframe id="Result" name="Result" frameborder="0"></Iframe>
</div>

</body>
</html>
