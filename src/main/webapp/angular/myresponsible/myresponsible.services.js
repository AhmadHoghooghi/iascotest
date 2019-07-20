angular.module('iascotest.myresponsible')
    .factory('MyresponsibleResource', ['$resource', 'iascotestResourceService', function ($resource, iascotestResourceService) {
      return $resource('', {}, iascotestResourceService.create('myResponsible'));
    }]);
