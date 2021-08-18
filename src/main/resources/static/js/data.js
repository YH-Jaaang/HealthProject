function saveDaily() {
  var form = document.querySelector("#saveForm");
  form.action = "/my/mydata";
  form.method = "POST";
  form.submit();
}
