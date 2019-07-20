angular.module('iascotest.mypost')
    .controller('MypostEditCtrl', ['$scope', 'MypostResource', 'iascotestControllerService', function ($scope, MypostResource, iascotestControllerService) {
      var loading = $.fn.showLoading();
    	iascotestControllerService.init($scope);
     	iascotestControllerService.applyEditCtrl($scope,'myPost', MypostResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('MypostListCtrl', ['$scope', 'MypostResource', 'iascotestControllerService', function ($scope, MypostResource, iascotestControllerService) {
      var loading = $.fn.showLoading();
    	iascotestControllerService.init($scope);
     	iascotestControllerService.applyListCtrl($scope,'myPost', MypostResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('MypostDisplayCtrl', ['$scope', '$location', '$routeParams', 'MypostResource', 'iascotestControllerService', function ($scope, $location, $routeParams, MypostResource, iascotestControllerService) {
      var loading = $.fn.showLoading();
    	iascotestControllerService.init($scope);
      iascotestControllerService.applyDisplayCtrl($scope,'myPost', MypostResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
