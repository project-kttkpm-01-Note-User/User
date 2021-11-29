# User

USER

addUser :

Post : http://localhost:8080/users

	data:{
		userName:"",
		password:""
	}

getAll :

	GET: http://localhost:8080/users

findById :

	GET : http://localhost:8080/users/1

findByUserName:

	GET: http://localhost:8080/users/username?userName=diem
