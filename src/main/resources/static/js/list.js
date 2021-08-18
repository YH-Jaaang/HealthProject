window.onload = function () {
  axios
    .get("http://localhost:9999/mycheck/dailies")
    .then(function (response) {
      var dailies = response.data;
      console.log("성공");
      printDailyList(dailies);
    })
    .catch(function () {
      console.log("실패");
    });
  function printDailyList(mDailies) {
    var dailies = mDailies;
    var dailyHtml = "";
    console.log("================================>");
    for (var i = 1; i < dailies.length; i++) {
      //dailyHtml +

      if (dailies[i].c_DATE != dailies[i - 1].c_DATE) {
        dailyHtml =
          '        <span class="daily-date">' +
          "Date " +
          dailies[i].c_DATE +
          "</span> " +
          '      <table class="table"> ' +
          "<thead>" +
          "<tr>" +
          '<th scope="col">TYPE</th>' +
          '<th scope="col">WEIGHT</th>' +
          '<th scope="col">REPS</th>' +
          '<th scope="col">SET</th>' +
          '<th scope="col">RPE</th>' +
          '<th scope="col">REST</th>' +
          "</tr>" +
          "</thead></table>";
      } else {
        dailyHtml =
          '      <table class="table"> ' +
          "<tbody>" +
          "<tr>" +
          '  <th scope="row">' +
          dailies[i].c_TYPE +
          "</br>" +
          "</th>" +
          "<td>" +
          dailies[i].c_WEIGHT +
          "kg" +
          "</td>" +
          "<td>" +
          dailies[i].c_REPS +
          "개" +
          "</td>" +
          "<td>" +
          dailies[i].c_SET +
          "세트" +
          "</td>" +
          "<td>" +
          dailies[i].c_RPE +
          "개" +
          "</td>" +
          "<td>" +
          dailies[i].c_REST +
          "분" +
          "</td>" +
          "</tr>" +
          "</tbody>" +
          "</table>" +
          "</span> " +
          '        <li class="list-group-item list-group-item-light">' +
          "후기 : " +
          dailies[i].c_MESSAGE +
          "</li> " +
          "</tr>" +
          "      </table> ";
      }

      +"<br></br><br></br><br></br>";
      document.getElementById("dailieslist").innerHTML += dailyHtml;
    }
  }
};

//위에거 백업
// window.onload = function () {
//   axios
//     .get("http://localhost:9999/my/dailies")
//     .then(function (response) {
//       var dailies = response.data;
//       console.log("성공");
//       printDailyList(dailies);
//     })
//     .catch(function () {
//       console.log("실패");
//     });
//   function printDailyList(mDailies) {
//     var dailies = mDailies;
//     var dailyHtml = "";
//     console.log("================================>");
//     for (var i = 1; i < dailies.length; i++) {
//       //dailyHtml +
//       if (dailies[i].c_DATE != dailies[i - 1].c_DATE) {
//         dailyHtml =
//           '        <span class="daily-date">' +
//           "Date " +
//           dailies[i].c_DATE +
//           "</span> ";
//       } else {
//         for (var j = 0; j < dailies.length; j++) {
//           dailyHtml =
//             '      <table class="table"> ' +
//             "<thead>" +
//             "<tr>" +
//             '<th scope="col">#</th>' +
//             '<th scope="col">WEIGHT</th>' +
//             '<th scope="col">REPS</th>' +
//             '<th scope="col">SET</th>' +
//             '<th scope="col">RPE</th>' +
//             '<th scope="col">REST</th>' +
//             "</tr>" +
//             "</thead>" +
//             "<tbody>" +
//             "<tr>" +
//             '  <th scope="row">TYPE' +
//             "<br>" +
//             dailies[j].c_TYPE +
//             "</br>" +
//             "</th>" +
//             "<td>" +
//             dailies[j].c_WEIGHT +
//             "kg" +
//             "</td>" +
//             "<td>" +
//             dailies[j].c_REPS +
//             "개" +
//             "</td>" +
//             "<td>" +
//             dailies[j].c_SET +
//             "세트" +
//             "</td>" +
//             "<td>" +
//             dailies[j].c_RPE +
//             "개" +
//             "</td>" +
//             "<td>" +
//             dailies[j].c_REST +
//             "분" +
//             "</td>" +
//             "</tr>" +
//             "</tbody>" +
//             "</table>" +
//             "</span> " +
//             '        <li class="list-group-item list-group-item-light">' +
//             "후기 : " +
//             dailies[j].c_MESSAGE +
//             "</li> " +
//             "</tr>" +
//             "      </table> ";
//         }
//       }

//       +"<br></br>";
//       document.getElementById("dailieslist").innerHTML += dailyHtml;
//     }
//   }
// };

//밖으로 빼기 실패
// window.onload = function () {
//   axios
//     .get("http://localhost:9999/my/dailies")
//     .then(function (response) {
//       var dailies = response.data;
//       console.log("성공");
//       printDailyList(dailies);
//     })
//     .catch(function () {
//       console.log("실패");
//     });
//   function printDailyList(mDailies) {
//     var dailies = mDailies;
//     console.log(dailies);
//     var dailyHtml = "";
//     console.log("================================>");
//     for (var i = 0; i < dailies.length; i++) {
//       if (dailies[i].c_DATE != dailies[i - 1].c_DATE) {
//         dailyHtml =
//           '        <span class="daily-date">' +
//           "Date " +
//           dailies[i].c_DATE +
//           "</span> " +
//           '      <table class="table"> ' +
//           "<thead>" +
//           "<tr>" +
//           '<th scope="col">#</th>' +
//           '<th scope="col">WEIGHT</th>' +
//           '<th scope="col">REPS</th>' +
//           '<th scope="col">SET</th>' +
//           '<th scope="col">RPE</th>' +
//           '<th scope="col">REST</th>' +
//           "</tr>" +
//           "</thead>";
//       } else {
//         for (var j = 0; j < dailies.length; j++) {
//           "<tbody>" +
//             "<tr>" +
//             '  <th scope="row">TYPE' +
//             "<br>" +
//             dailies[j].c_TYPE +
//             "</br>" +
//             "</th>" +
//             "<td>" +
//             dailies[j].c_WEIGHT +
//             "kg" +
//             "</td>" +
//             "<td>" +
//             dailies[j].c_REPS +
//             "개" +
//             "</td>" +
//             "<td>" +
//             dailies[j].c_SET +
//             "세트" +
//             "</td>" +
//             "<td>" +
//             dailies[j].c_RPE +
//             "개" +
//             "</td>" +
//             "<td>" +
//             dailies[j].c_REST +
//             "분" +
//             "</td>" +
//             "</tr>" +
//             "</tbody>" +
//             "</table>" +
//             "</span> ";
//         }
//       }
//       +'        <li class="list-group-item list-group-item-info">' +
//         "후기 : " +
//         dailies[i].c_MESSAGE +
//         "</li> ";
//     }
//     +"<br></br>";

//     console.log(dailyHtml);
//     document.getElementById("dailieslist").innerHTML += dailyHtml;
//   }
// };

// window.onload = function () {
//   axios
//     .get("http://localhost:9999/my/dailies")
//     .then(function (response) {
//       var dailies = response.data;
//       console.log("성공");
//       printDailyList(dailies);
//     })
//     .catch(function () {
//       console.log("실패");
//     });
//   function printDailyList(mDailies) {
//     var dailies = mDailies;
//     console.log(dailies);
//     var dailyHtml = "";
//     console.log("================================>");
//     for (var i = 0; i < dailies.length; i++) {
//       dailyHtml =
//         '        <span class="daily-date">' +
//         "Date " +
//         dailies[i].c_DATE +
//         "</span> " +
//         '      <table class="table"> ' +
//         "<thead>" +
//         "<tr>" +
//         '<th scope="col">#</th>' +
//         '<th scope="col">WEIGHT</th>' +
//         '<th scope="col">REPS</th>' +
//         '<th scope="col">SET</th>' +
//         '<th scope="col">RPE</th>' +
//         '<th scope="col">REST</th>' +
//         "</tr>" +
//         "</thead>" +
//         "<tbody>" +
//         "<tr>" +
//         '  <th scope="row">TYPE' +
//         "<br>" +
//         dailies[i].c_TYPE +
//         "</br>" +
//         "</th>" +
//         "<td>" +
//         dailies[i].c_WEIGHT +
//         "kg" +
//         "</td>" +
//         "<td>" +
//         dailies[i].c_REPS +
//         "개" +
//         "</td>" +
//         "<td>" +
//         dailies[i].c_SET +
//         "세트" +
//         "</td>" +
//         "<td>" +
//         dailies[i].c_RPE +
//         "개" +
//         "</td>" +
//         "<td>" +
//         dailies[i].c_REST +
//         "분" +
//         "</td>" +
//         "</tr>" +
//         "</tbody>" +
//         "</table>" +
//         "</span> ";
//       +'        <li class="list-group-item list-group-item-info">' +
//         "후기 : " +
//         dailies[i].c_MESSAGE +
//         "</li> " +
//         "<br></br>";

//       console.log(dailyHtml);
//       document.getElementById("dailieslist").innerHTML += dailyHtml;
//     }
//   }
//};//
