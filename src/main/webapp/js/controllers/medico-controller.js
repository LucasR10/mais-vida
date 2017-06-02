angular.module('appModulo').controller('medicoController', function ($scope , $http ,$location ) {
	  
	var urlBase  = $location.protocol()+"://"+$location.host()+":"+$location.port()+getContextPath()  ;
	
	/** Lista todos os medicos ok */
    	$scope.listarMedicos = function () {
    		$http.get(urlBase+"/rest/medico/listar").success(  function( medicos ) {
    			$scope.medicos = medicos;
    			console.log( medicos );
    		}).error(function(erro) {
    			console.log("Error: " + erro);
    		});
    	};
    	
    	/** Salvar medico ok */
    	$scope.salvarMedico = function ( medico ) {
    		$http.post(urlBase+"/rest/medico/adicionar", medico)
    		.success(  function( medico ) {
    			$scope.listarMedicos();
    			$scope.cencelar();
    		}).error(function(erro) {
    			console.log("Error: " + erro);
    		});
    		
    	};
    	
    	/** Excluir medico ok */
    	$scope.excluirMedico = function ( medico ) {
    		var sim = confirm("Deseja excluir o médico "+ medico.primeiroNome)
    		if( sim ){
	    		$http.delete(urlBase+"/rest/medico/excluir/"+medico.codigo)
	    		.success(  function( medico ) {
	    		 $scope.listarMedicos();
	    		}).error(function(erro) {
	    			console.log("Error: " + erro);
	    		});
    		}//endIf
    	};
    	
    	/** Editar medico ok */
    	$scope.editarMedico = function ( medico ) {
    	  $scope.medico = medico;
    	};
    	
    	/** limpar medico ok */
    	$scope.cencelar = function () {
      	  $scope.medico = "";
      	};
      	
      	/** visualizar medico ok */
    	$scope.visualizar = function ( medico ) {
      	  $scope.medico = medico ;
       };
       //contex dinamico.
        function getContextPath() {
    	   return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
    	}	
});