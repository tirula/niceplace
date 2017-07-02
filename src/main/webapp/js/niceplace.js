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
});