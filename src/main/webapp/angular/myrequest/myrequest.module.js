angular.module('iascotest.myrequest',['ngRoute',
   ['/iascotest/angular/lib.js'
	,'/iascotest/angular/myresponsible/myresponsible.module.js'
    ,'/iascotest/angular/myrequest/myrequest.controllers.js'
    ,'/iascotest/angular/myrequest/myrequest.services.js']])
  .config(['$routeProvider', function ($routeProvider) {
    $routeProvider
      .when('/iascotest/myrequest/list', {templateUrl: '/iascotest/angular/myrequest/myrequest.list.html', controller: 'MyrequestListCtrl'})
      .when('/iascotest/myrequest/edit', {templateUrl: '/iascotest/angular/myrequest/myrequest.edit.html', controller: 'MyrequestEditCtrl'})
      .when('/iascotest/myrequest/edit/:id', {templateUrl: '/iascotest/angular/myrequest/myrequest.edit.html', controller: 'MyrequestEditCtrl'})
      .when('/iascotest/myrequest/display/:id', {templateUrl: '/iascotest/angular/myrequest/myrequest.display.html', controller: 'MyrequestDisplayCtrl'})
      	
  }]);
