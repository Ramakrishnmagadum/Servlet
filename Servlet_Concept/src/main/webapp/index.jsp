<html>
<head>
<style>
.container {
	border: 1px solid black;
	width: 27%;
	margin: auto;
	padding: 20px;
}
</style>
</head>
<body>
	<h1>Good Morning</h1>
	<h2>Hello World!</h2>
	<div>
		<a href="servlet">Servlet</a>
	</div>
	<div>
		<a href="genericServlet">GenericServlet</a>
	</div>
	<div>
		<a href="httpServlet">HttpServlet</a>
	</div>

	<form action="Registerform" method="post" class="container">
		<center>
			<h1>My Form</h1>
		</center>
		<table>
			<tr>
				<td>Enter Your Name :</td>
				<td><input type="text" name="user_name"
					placeholder="Enter Name"></td>
			</tr>

			<tr>
				<td>Enter Password :</td>
				<td><input type="password" name="user_password"
					placeholder="Enter Password"></td>
			</tr>

			<tr>
				<td>Enter Email :</td>
				<td><input type="email" name="user_email"
					placeholder="Enter Email"></td>
			</tr>

			<tr>
				<td>Choose Your Gender :</td>
				<td><input type="radio" name="user_gender" value="male">Male
					<input type="radio" name="user_gender" value="female">Female</td>
			</tr>

			<tr>
				<td>Choose Your Course :</td>
				<td><select name="course">
						<option value="PHP">PHP</option>
						<option value="Java">Java</option>
						<option value="Pyhton">Pyhton</option>
				</select></td>
			</tr>

			<tr>
				<td><input type="checkbox" value="checked" name="cond"
					style="float: right"></td>
				<td>Accept Term and Conditions</td>
			</tr>

			<tr>
				<td></td>
				<td>
					<button type="submit">Submit</button>
					<button type="reset">Reset</button>
				</td>
			</tr>
		</table>

	</form>
</body>
</html>
