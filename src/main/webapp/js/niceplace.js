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
		console.log($("#formPlace").serialize())
        $.ajax({
            type: 'POST',
            url: 'searchPlace',
            data: $("#formPlace").serialize(),
            success : function(data){
                data=$(data).find('div#tabelaPlace');
                $('#tabelaPlace').html(data);
            }
        });
    });
});