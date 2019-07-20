angular.module('iascotest.myresponsible',['ngRoute',
   ['/iascotest/angular/lib.js'
    ,'/iascotest/angular/myresponsible/myresponsible.controllers.js'
    ,'/iascotest/angular/myresponsible/myresponsible.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/iascotest/myresponsible/list', {templateUrl: '/iascotest/angular/myresponsible/myresponsible.list.html', controller: 'MyresponsibleListCtrl'})
      .when('/iascotest/myresponsible/edit', {templateUrl: '/iascotest/angular/myresponsible/myresponsible.edit.html', controller: 'MyresponsibleEditCtrl'})
      .when('/iascotest/myresponsible/edit/:id', {templateUrl: '/iascotest/angular/myresponsible/myresponsible.edit.html', controller: 'MyresponsibleEditCtrl'})
      .when('/iascotest/myresponsible/display/:id', {templateUrl: '/iascotest/angular/myresponsible/myresponsible.display.html', controller: 'MyresponsibleDisplayCtrl'})
      	
  }]);
