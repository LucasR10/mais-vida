angular.module('appModulo').controller('usuarioController', function ($scope , $http ,$location ) {
	  
	var urlBase  = $location.protocol()+"://"+$location.host()+":"+$location.port()+getContextPath()  ;
	
	/** Lista todos os medicos ok */
    	$scope.buscarUsuarioLogado = function () {
    		$scope.usuario = {nome:"John Doe",email:"jdandturk@gmail.com"};
    	};
    	
    	
       //contex dinamico.
        function getContextPath() {
    	   return window.location.pathname.substring(0, window.location.pathname.indexOf("/",2));
    	}	
});