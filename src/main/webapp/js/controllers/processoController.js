angular.module('appModulo').controller('processoController', function ($scope , $http ) {
	  
    $scope.titulo = "Cadastrar processo";


   $scope.salvarProcesso = function (processo) {
   	console.log( processo );
   } ;

});