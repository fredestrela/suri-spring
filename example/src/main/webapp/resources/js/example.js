$(function(){
	
	$('#globalMessagesDiv').addClass('alert-' + $('#globalMessagesDiv li').attr("class"));
	
	
	//auto complete
    $('.ui-autocomplete').removeClass('form-control');
    $('.ui-autocomplete-input').addClass('form-control');
    
    // auto complete with dropdown
    $('.ui-autocomplete-dropdown').parent().addClass('input-group');
    $('.ui-autocomplete-dropdown').addClass('input-group-btn');
    
    $('.ui-autocomplete-multiple').addClass('form-control');
	
});



