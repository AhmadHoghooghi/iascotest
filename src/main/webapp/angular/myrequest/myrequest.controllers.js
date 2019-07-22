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
        //this method opens dialogue to manger list of responsibles fo a request
        //A new html and controller is created for this dialogue
        // note how primary key of request is passed
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
        iascotestControllerService.init($scope);

        iascotestControllerService.applyMinimalCtrl($scope, 'myRequest', MyrequestResource);
        //param to pass to dynamic form and its controller
        $scope.myresponsibleParams = {
            //this field will hide search panel in customized dialogue
            hideSearchPanel: true,
            masterPK: $scope.id,
            //this is how primary key of request is passed
            myrequestId:data.masterpk,
            'filter.eq:request.pk': $scope.id
        };
        $scope.back = function () {
            modalInstance.dismiss();
        }

    }])

;
