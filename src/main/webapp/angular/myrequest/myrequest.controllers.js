angular.module('iascotest.myrequest')
    .controller('MyrequestEditCtrl', ['$scope', 'MyrequestResource', 'iascotestControllerService', function ($scope, MyrequestResource, iascotestControllerService) {
      var loading = $.fn.showLoading();
    	iascotestControllerService.init($scope);
     	iascotestControllerService.applyEditCtrl($scope,'myRequest', MyrequestResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])

    .controller('MyrequestListCtrl', ['$scope', 'MyrequestResource', 'iascotestControllerService', function ($scope, MyrequestResource, iascotestControllerService) {
      var loading = $.fn.showLoading();
    	iascotestControllerService.init($scope);
     	iascotestControllerService.applyListCtrl($scope,'myRequest', MyrequestResource, function (data) {
        $.fn.hideLoading(loading);
      });
    }])
    
    	

    .controller('MyrequestDisplayCtrl', ['$scope', '$location', '$routeParams', 'MyrequestResource', 'iascotestControllerService', function ($scope, $location, $routeParams, MyrequestResource, iascotestControllerService) {
      var loading = $.fn.showLoading();
    	iascotestControllerService.init($scope);
      iascotestControllerService.applyDisplayCtrl($scope,'myRequest', MyrequestResource, function (data) {
          $.fn.hideLoading(loading);
      });
      
      
      
		$scope.myresponsibleParams={
      hideSearchPanel: true,
      masterPK:$scope.id,
      'filter.eq:request.pk': $scope.id
    };
    }]);
