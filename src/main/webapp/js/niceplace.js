$(document).ready(function() {

	$("#btSaveUser").click(function(e){
		e.stopPropagation();
		e.preventDefault(); 
		console.log($("#formUser").serialize())
        $.ajax({
            type: 'POST',
            url: 'user',
            data: $("#formUser").serialize(),
            success : function(data){
                data=$(data).find('div#tableUserID');
                $('#tableUserID').html(data);
            }
        });
    });
		
	$("#btSearchPlace").click(function(e){
		e.stopPropagation();
		e.preventDefault(); 
        $.ajax({
            type: 'GET',
            url: 'searchPlace',
            data: $("#formPlace").serialize(),
            success : function(data){
                data=$(data).find('div#tabelaPlace');
                $('#tabelaPlace').html(data);
            }
        });
    });
	
	$("#btNewPlace").click(function(e){
		e.stopPropagation();
		e.preventDefault(); 
		var path = window.location.pathname.split('/')[1];
		$('#formPlace').attr('method', "GET");
	    $('#formPlace').attr('action', '/'+path+"/place/novo").submit();
    });
	
	$("#btSavePlace").click(function(e){
		e.stopPropagation();
		e.preventDefault(); 
		var path = window.location.pathname.split('/')[1];
		$('#formPlaceNew').attr('method', "POST");
	    $('#formPlaceNew').attr('action', '/'+path+"/place/novo").submit();
    });
	
});