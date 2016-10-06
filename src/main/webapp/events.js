function Events ($scope,$http) {
    //noinspection JSUnresolvedFunction
    $http.get('http://localhost:8080/events').success(function (data){
        $scope.events=data;
    })
}