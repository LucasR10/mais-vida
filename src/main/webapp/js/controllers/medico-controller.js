angular.module('alurapic').controller('medicoController', function ($scope , $http ) {
	
	
   
    	$scope.listarMedicos = function () {
    		$http.get("http://localhost:8181/prova/rest/medico/listar").success(  function( medicos ) {
    			$scope.medicos = medicos;
    			console.log( medicos );
    		}).error(function(erro) {
    			console.log("Error: " + erro);
    		});
    	};
    	
     
	
});