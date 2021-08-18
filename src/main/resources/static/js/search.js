function searchExercise() {
  var form = document.querySelector("#searchEx");
  form.action = "/search/exercise";
  form.method = "POST";
  form.submit();
}
