angular.module('iascotest.mypost',['ngRoute',
   ['/iascotest/angular/lib.js'
    ,'/iascotest/angular/mypost/mypost.controllers.js'
    ,'/iascotest/angular/mypost/mypost.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/iascotest/mypost/list', {templateUrl: '/iascotest/angular/mypost/mypost.list.html', controller: 'MypostListCtrl'})
      .when('/iascotest/mypost/edit', {templateUrl: '/iascotest/angular/mypost/mypost.edit.html', controller: 'MypostEditCtrl'})
      .when('/iascotest/mypost/edit/:id', {templateUrl: '/iascotest/angular/mypost/mypost.edit.html', controller: 'MypostEditCtrl'})
      .when('/iascotest/mypost/display/:id', {templateUrl: '/iascotest/angular/mypost/mypost.display.html', controller: 'MypostDisplayCtrl'})
      	
  }]);
