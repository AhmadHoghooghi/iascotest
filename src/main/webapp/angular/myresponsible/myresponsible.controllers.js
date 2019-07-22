angular.module('iascotest.myresponsible')
    .controller('MyresponsibleEditCtrl', ['$scope', 'MyresponsibleResource', 'iascotestControllerService', 'data', '$modalInstance',
                function ($scope, MyresponsibleResource, iascotestControllerService, data, modalInstance) {
      var loading = $.fn.showLoading();
    	iascotestControllerService.init($scope);

    	if(data.params && data.params.myrequestId){//if called from SetResponsibleForRequestCtrl
    	    //overriding $scope.actions.edit.save from lib.actions
            $scope.actions.edit.save = function (remoteResource, entityName, flash, updateCallback, masterFieldName) {
                var loading = $.fn.showLoading();
                    //this is customized line
                    $scope.data['request'] = {pk: data.params.myrequestId};

                if ($scope.actions.common.validateForm(flash, "#" + entityName + "EditForm")) {
                    remoteResource.update($scope.data).$promise.then(function (data) {
                        $.fn.hideLoading(loading);
                        if (data.success) {
                            flash.success = data.message;
                            updateCallback = function () {//prevent application from going to responsible list on dialogue close
                                modalInstance.close()
                            }

                            if (angular.isFunction(updateCallback))
                                updateCallback(data);
                        } else {
                            flash.error = data.message;
                        }
                    }, function (error) {
                        $.fn.hideLoading(loading);
                        flash.error = error.data.message;
                    });
                    return true;
                } else {
                    $.fn.hideLoading(loading);
                }
                return false;
            };
        }


     	iascotestControllerService.applyEditCtrl($scope,'myResponsible', MyresponsibleResource, function (data) {
        $.fn.hideLoading(loading);
      });

    	$scope.back = function () {
            modalInstance.dismiss();
        }
    }])

    .controller('MyresponsibleListCtrl', ['$scope', 'MyresponsibleResource', 'iascotestControllerService',
                                    function ($scope, MyresponsibleResource, iascotestControllerService) {
      var loading = $.fn.showLoading();
        iascotestControllerService.init($scope);

        $scope.actions.common.makeEditDialog = function (entityName, id, remoteResource, dialogs, updateCallback, master_id) {
            dialogs.create('/iascotest/angular/myresponsible/myresponsible.edit.html',  'MyresponsibleEditCtrl', {
                params: {
                    pk: id,
                    masterPK: master_id,
                    myrequestId:$scope.parameters.myrequestId,
                    ignoreQueryString: true
                },
                updateCallback: updateCallback,
                entityName: entityName,
                resource: remoteResource
            }).result.then(function () {
                $scope.actions.list.reloadTable();
            });
        };
        // initializing search filter using given request id
        if($scope.parameters && $scope.parameters.myrequestId){//calling list from SetResponsibleForRequestCtrl
            $scope.parameters['eq:request.pk'] = $scope.parameters.myrequestId;
        }
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
