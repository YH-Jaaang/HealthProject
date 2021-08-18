function login() {
  var form = document.querySelector("#loginForm");
  form.action = "/health/login";
  form.method = "POST";
  form.submit();
}
