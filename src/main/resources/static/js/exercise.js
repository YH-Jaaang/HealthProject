function exercise() {
  var array = new Array();
  $("input:checkbox[name=chk]:checked").each(function () {
    array.push(this.value);
  });
  var num = 0;
  $("#exer0").val(array[0]);
  $("#exer1").val(array[1]);
  var form = document.querySelector("#exerForm");
  form.action = "/trainer/trainermatch";
  form.method = "POST";
  form.submit();
}
