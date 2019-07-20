angular.module('iascotest.myresponsible')
    .controller('MyresponsibleEditCtrl', ['$scope', 'MyresponsibleResource', 'iascotestControllerService', function ($scope, MyresponsibleResource, iascotestControllerService) {
      var loading = $.fn.showLoading();
    	iascotestControllerService.init($scope);
     	iascotestControllerService.applyEditCtrl($scope,'myResponsible', MyresponsibleResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('MyresponsibleListCtrl', ['$scope', 'MyresponsibleResource', 'iascotestControllerService', function ($scope, MyresponsibleResource, iascotestControllerService) {
      var loading = $.fn.showLoading();
    	iascotestControllerService.init($scope);
     	iascotestControllerService.applyListCtrl($scope,'myResponsible', MyresponsibleResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('MyresponsibleDisplayCtrl', ['$scope', '$location', '$routeParams', 'MyresponsibleResource', 'iascotestControllerService', function ($scope, $location, $routeParams, MyresponsibleResource, iascotestControllerService) {
      var loading = $.fn.showLoading();
    	iascotestControllerService.init($scope);
      iascotestControllerService.applyDisplayCtrl($scope,'myResponsible', MyresponsibleResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
    }]);
