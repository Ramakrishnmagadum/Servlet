<%@page import="com.tech.blog.helper.ConnectionProvider"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.sql.Connection"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Home Page</title>

<!-- BootStrap Css -->
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">

<!-- This is MyStyl.css  -->
<link href="css/MyStyle.css" rel="stylesheet" type="text/css">

<!-- This is for Icon -->
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<style >
	 .banner-background{ 
/* 	 this is clip-path it will help to make zigzag  */
 	clip-path: polygon(0 0, 100% 0, 100% 96%, 81% 92%, 56% 98%, 19% 90%, 0 100%);
} 
	</style>
</head>
<body>

	<!-- this line will include the NavBar  -->
	<%@include file="Normal_Navbar.jsp"%>



	<!--        Banners -->
	<div class="container-fluid p-0 m-0">
		<div class="jumbotron primary-background text-white banner-background">
			<div class="container">
				<h3 class="display-3">Welcome to TechBlog</h3>
				<p>A programming language is a system of notation for writing
					computer programs.[1] Programming languages are described in terms
					of their syntax (form) and semantics (meaning), usually defined by
					a formal language. Languages usually provide features such as a
					type system, variables, and mechanisms for error handling.</p>
				<p>Programming languages differ from natural languages in that
					natural languages are used for interaction between people, while
					programming languages are designed to allow humans to communicate
					instructions to machines.</p>
				<button class="btn btn-outline-light btn-lg">
					<span class="fa fa-user-plus"></span> Start ! its free
				</button>
				<a href="login.jsp" class="btn btn-outline-light btn-lg">
					<span class="fa fa-user-circle-o fa-spin"></span> login
				</a>
			</div>
		</div>
	</div>



	<!-- 	Cards -->
	<div class="container">
		<div class="row mb-2">
			<div class="col-md-4">
				<div class="card" ">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card" ">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card" ">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more</a>
					</div>
				</div>
			</div>
		</div>
		<div class="row ">
			<div class="col-md-4">
				<div class="card" ">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card" ">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more</a>
					</div>
				</div>
			</div>
			<div class="col-md-4">
				<div class="card" ">
					<div class="card-body">
						<h5 class="card-title">Java Programming</h5>
						<p class="card-text">Some quick example text to build on the
							card title and make up the bulk of the card's content.</p>
						<a href="#" class="btn primary-background text-white">Read more</a>
					</div>
				</div>
			</div>
		</div>
	</div>


	<!-- BootStrap Javascript  -->
	<script src="https://code.jquery.com/jquery-3.7.1.min.js"
		integrity="sha256-/JqT3SQfawRcv/BIHPThkBvs0OEvtFFmqPF/lYI/Cxo="
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>
</body>

<!-- this is MyJavaScript File  -->
<script src="Js/Myjs.js" type="text/javascript"></script>
<!-- By this code we can check Bootstrap is applied or not .. -->
<!-- <!-- <script > -->
<!-- // $(document).ready(function(){ -->
<!-- // 	alert("Document loded") -->
<!-- // }); -->
<!-- <!--  </script>  -->

</html>