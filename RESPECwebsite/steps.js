var Steps_Data = [ 2768, 5023, 2516, 2561, 5148, 3557, 1473, 646, 18, 2085, 4070, 5355, 2090, 3287, 4052, 931, 1652, 2566, 3722, 9761, 7685, 3645, 773, 2538, 8017, 6232, 7149, 2199, 16316, 2244, 1594 ];

//var steps_list = [ 2768, 5023, 2516, 2561, 5148, 3557, 1473, 646, 18, 2085, 4070, 5355 ];

var officeNames = [
    "AUSTIN, TX", "CASTROVILLE, TX", "RICHARDSON, TX", "SAN ANTONIO, TX",
    "HURRICANE, WV", "SANTA FE, NM", "ROSEVILLE, MN", "DENVER, CO", "RAPID CITY, SD",
    "ROCHESTER, NY", "RENO, NV", "EDMONTON, AB" ];

function print_scoreboards() {
    let office_on_page = document.getElementById("office");
    let steps_on_page = document.getElementById("steps");
    let office_list = [];
    let steps_list = [];

    document.write('<div id="table1">');
    for (let index = 0; index < officeNames.length; index++) {
        //creating the list of offices and steps
        office_list[index] = officeNames[index];

        document.write("<p>" + office_list[index] + "</p>");   
        document.write("<br>");
        
    }
    document.write('</div >');


    document.write('<div id="table2">');
    for (let index = 0; index < officeNames.length; index++) {
        //creating the list of offices and steps
        steps_list[index] = Steps_Data[index];

        document.write("<p>" + steps_list[index] + "</p>");
        document.write("<br>");

    }
    document.write('</div >');

      /*
    window.addEventListener('load', function () {
            let index = 0;
            
        setInterval(function () {
            AddSteps = Math.floor((Math.random() * 30) + 1);
            AddSteps = Steps_Data[AddSteps];
            steps_list[index] = steps_list[index] + AddSteps;
            console.log(steps_list[index]);
            document.write("<p>" + steps_list[index] + "</p>");
            document.write("<br>");
            index++;
            
        }, 1000);
    }, false);

    */
}