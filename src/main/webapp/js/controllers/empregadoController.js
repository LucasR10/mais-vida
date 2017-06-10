angular.module('appModulo').controller('indexController', function ($scope , $http ) {
	 
	$scope.titulo = "Lista de processos ";
	
	  /** Listar todos os processos ok */
    	$scope.listarProcessos = function () {
    		     
				   		$scope.processos = [ {
					nome : 'Penal',
					numero : '00003',
					dataInc : '14/11/2014',
					dataFim : '14/11/2016',
					ativo : 'true',
				}, {
					nome : 'processual',
					numero : '00002',
					dataInc : '14/11/2014',
					dataFim : '14/11/2017',
					ativo : 'true'
				}, {
					nome : 'Pensão',
					numero : '00000034',
					dataInc : '14/11/2014',
					dataFim : '14/11/2016',
					ativo : 'false'
				}, {
					nome : 'Alimentação',
					numero : '000004',
					dataInc : '14/11/2014',
					dataFim : '14/11/2015',
					ativo : 'true'
				} ];
	            console.log( $scope.processos );
    	};
    	
    	/** remover o processo ok */
    	$scope.excluirProcesso = function ( index ){
    	  //var index =	$scope.processos.indexOf(processo);
    		var limit = 1;
    	    console.log( index );
    	    $scope.processos.splice(index, limit)//remover index do array.
    	};
    	
  	   $scope.listarProcessos(); //init;
  	   
  	   
  	   
   
  	   
  	   
  	   
});