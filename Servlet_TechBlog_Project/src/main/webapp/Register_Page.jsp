<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>

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

<style>
.banner-background {
	/* 	 this is clip-path it will help to make zigzag  */
	clip-path: polygon(0 0, 100% 0, 100% 96%, 81% 92%, 56% 98%, 19% 90%, 0 100%);
}
</style>
</head>
<body>

	<!-- this line will include the NavBar  -->
	<%@include file="Normal_Navbar.jsp"%>

	<main class="primary-background p-5   " style="padding-bottom: 70px">
		<div class="container">
			<div class="col-md-6 offset-md-3">
				<div class="card">
					<div
						class="card-header fa fa-user-circle text-center fa-3x primary-background">
						<br>Register here
					</div>
					<div class="card-body">
						<form action="RegisterServlet" method="post" class="reg-form">
							<div class="form-group">
								<label for="user_name">User Name</label> <input name="user_name"
									type="text" class="form-control" id="user_name"
									aria-describedby="emailHelp" placeholder="Enter Name">
							</div>

							<div class="form-group">
								<label for="exampleInputEmail1">Email address</label> <input
									name="user_email" type="email" class="form-control"
									id="exampleInputEmail1" aria-describedby="emailHelp"
									placeholder="Enter email"> <small id="emailHelp"
									class="form-text text-muted">We'll never share your
									email with anyone else.</small>
							</div>
							<div class="form-group">
								<label for="exampleInputPassword1">Password</label> <input
									name="user_password" type="password" class="form-control"
									id="exampleInputPassword1" placeholder="Password">
							</div>

							<div class="form-group">
								<label for="gender">Select Gender</label><br> <input
									type="radio"  name="gender" value="male">Male
								<input type="radio"  name="gender" value="female">Female
							</div  class="form-group">
							<textarea name="about" id="" cols="30" rows="10"
								class="form-control"
								placeholder="Enter Something about yourself">
								</textarea>
							<div></div>

							<div class="form-check">
								<input type="checkbox" class="form-check-input" name="check"
									id="exampleCheck1"> <label class="form-check-label"
									for="exampleCheck1">Terms and Condition</label>
							</div>
							<br>
							<button type="submit" class="btn btn-primary">Submit</button>
						</form>
					</div>

				</div>
			</div>
		</div>


	</main>




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

	<!-- this is MyJavaScript File  -->
	<script src="Js/Myjs.js" type="text/javascript"></script>

	
</body>

<!-- By this code we can check Bootstrap is applied or not .. -->
 <script >
 $(document).ready(function(){
	 console.log("loaded...")
 	$('#reg-form').on('submit', function(event){
 		
 		event.preventDefault();
 		
 		let form =new FormData(this);
 		
 		//send regoster Servlet.
 		$.ajax({
 			url: "RegisterServlet",
 			type: 'POST',
 			data : form ,
 			succes:function(data , textStatus , jqXHR ){
 				console.log(data)
 			},error: function (jqXHR, textStatus , errorThrown){
 				console.log(jqXHR)
 			},
 			processData : false ,
 			contentType : false
 		});
 	});
 	
 });
  </script> 


</html>