angular.module('iascotest.mypost')
    .factory('MypostResource', ['$resource', 'iascotestResourceService', function ($resource, iascotestResourceService) {
      return $resource('', {}, iascotestResourceService.create('myPost'));
    }]);
