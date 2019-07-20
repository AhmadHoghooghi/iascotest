angular.module('iascotest.myrequest')
    .factory('MyrequestResource', ['$resource', 'iascotestResourceService', function ($resource, iascotestResourceService) {
      return $resource('', {}, iascotestResourceService.create('myRequest'));
    }]);
