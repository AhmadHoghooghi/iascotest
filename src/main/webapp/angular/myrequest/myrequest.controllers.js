angular.module('iascotest.myrequest')
    .controller('MyrequestEditCtrl', ['$scope', 'MyrequestResource', 'iascotestControllerService', function ($scope, MyrequestResource, iascotestControllerService) {
        var loading = $.fn.showLoading();
        iascotestControllerService.init($scope);
        iascotestControllerService.applyEditCtrl($scope, 'myRequest', MyrequestResource, function (data) {
            $.fn.hideLoading(loading);
        });
    }])
    .controller('MyrequestListCtrl', ['$scope', 'MyrequestResource', 'iascotestControllerService','dialogs',
                            function ($scope, MyrequestResource, iascotestControllerService, dialogs) {
        var loading = $.fn.showLoading();
        iascotestControllerService.init($scope);
        iascotestControllerService.applyListCtrl($scope, 'myRequest', MyrequestResource, function (data) {
            $.fn.hideLoading(loading);
        });
        $scope.manageResponsibles = function(masterpk){
            dialogs.create('/iascotest/angular/myrequest/myrequest_editresponsible.html', 'SetResponsibleForRequestCtrl', {masterpk:masterpk});
        };

    }])
    .controller('MyrequestDisplayCtrl', ['$scope', '$location', '$routeParams', 'MyrequestResource', 'iascotestControllerService'
        , function ($scope, $location, $routeParams, MyrequestResource, iascotestControllerService) {
        var loading = $.fn.showLoading();
        iascotestControllerService.init($scope);
        iascotestControllerService.applyDisplayCtrl($scope, 'myRequest', MyrequestResource, function (data) {
            $.fn.hideLoading(loading);
        });
    }])
    //todo something else should be injected insted of 'MyrequestResource'; or??
    .controller('SetResponsibleForRequestCtrl', ['$scope', 'MyrequestResource', 'iascotestControllerService', 'data', '$modalInstance',
        function ($scope, MyrequestResource, iascotestControllerService, data, modalInstance) {
        // var loading = $.fn.showLoading();
        iascotestControllerService.init($scope);

        iascotestControllerService.applyMinimalCtrl($scope, 'myRequest', MyrequestResource);
        //applyMinimalCtrl = function ($scope, entityName, remoteResource)
        //     $.fn.hideLoading(loading);
        $scope.myresponsibleParams = {
            hideSearchPanel: true,
            masterPK: $scope.id,
            //
            myrequestId:data.masterpk,
            'filter.eq:request.pk': $scope.id
        };
        $scope.back = function () {
            modalInstance.dismiss();
        }

    }])

;
