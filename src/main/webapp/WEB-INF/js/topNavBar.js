

// const home = document.getElementById("home");
const d = document.getElementById("topnav");
const list = document.getElementById("list");
const regUser = document.getElementById("reguser");
const logIn = document.getElementById("login");
const logOut = document.getElementById("logout");
// Adding possible other navbar items

const user = '${user}';
const employee = '${emp}';
const isAdmin = '${isadmin}';
const loggedInUser = '<% request.getSession().getAttribute("user");%>';

console.log("is user logged in? "+loggedInUser);
console.log("is admin?"+isAdmin);

//if loggedInUser === user then remove the following
if (user === loggedInUser){
	d.removeChild(list);
	d.removeChild(regUser);
	d.removeChild(logOut);
}
// or else if user not an admin then remove the login
else if (isAdmin){
	d.removeChild(logIn);
}
//or else if user is not logged in then remove login and register user
else if (user !== loggedInUser) {
	d.removeChild(regUser);
	d.removeChild(logIn);
}
