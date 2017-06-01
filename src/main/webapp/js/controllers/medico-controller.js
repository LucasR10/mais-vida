angular.module('appModulo').controller('medicoController', function ($scope , $http ) {
	
	
   
    	$scope.listarMedicos = function () {
    		$http.get("http://localhost:8181/prova/rest/medico/listar").success(  function( medicos ) {
    			$scope.medicos = medicos;
    			console.log( medicos );
    		}).error(function(erro) {
    			console.log("Error: " + erro);
    		});
    	};
    	
    	$scope.buscarMedico = function ( codigo ) {
    		
    		$http.get("http://localhost:8181/prova/rest/medico/bucar"+codigo)
    		.success(  function( medico ) {
    			$scope.medico = medico;
    			console.log( medico );
    		}).error(function(erro) {
    			console.log("Error: " + erro);
    		});
    		console.log(medico);
    	};
    	
    	$scope.salvarMedico = function ( medico ) {
    		$http.post("http://localhost:8181/prova/rest/medico/adicionar", medico)
    		.success(  function( medico ) {
    			$scope.medico = medico;
    			console.log( medico );
    		}).error(function(erro) {
    			console.log("Error: " + erro);
    		});
    		console.log(medico);
    	};
    	
    	$scope.excluirMedico = function ( medico ) {
    		$http.post("http://localhost:8181/prova/rest/medico/adicionar", medico)
    		.success(  function( medico ) {
    			$scope.medico = medico;
    			console.log( medico );
    		}).error(function(erro) {
    			console.log("Error: " + erro);
    		});
    		console.log(medico);
    	};
    		              
    	
	
});