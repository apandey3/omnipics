'use strict';

/* Controllers */

var omniPicsApp = angular.module('omniPicsApp', []);

omniPicsApp.controller('OmniPicsCtrl', function($scope, $http) {
  $http.get('api/v1/albums').success(function(data) {
    $scope.albums = data.albums;
  });

  $scope.orderProp = 'age';
});