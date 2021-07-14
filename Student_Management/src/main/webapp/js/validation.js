$(function() {
			var er_count = 0;
			$("#name_error").hide();
			$("#num_error").hide();
			$("#country_error").hide()
			
		$("#name").focusout(function() {
			check_name();
		})
		})
		$("#telephone").focusout(function() {
			check_tel();
		})
		$("#country").focusout(function() {
			check_country();
		})

		function check_name() {
			var reg_name = /^[a-zA-Z]+(([',. -][a-zA-Z ])?[a-zA-Z]*)$/ ;
			var name = $("#name").val();
			if (!reg_name.test(name) || name == "") {
				$("#name_error").html(
						"Should contain only Characters and not empty")
				$("#name_error").show();
				$("#name").css("border", "1px solid #F90A0A");
			} else {
				$("#name_error").hide();
				$("#name").css("border", "2px solid #34F458");
			}
		}

		function check_tel() {
			var phone = $("#telephone").val();
			var regnumber = /^[0-9]{10}$/;
			if (regnumber.test(phone)) {
				$("#num_error").hide();
				$("#telephone").css("border", "2px solid #34F458");

			} else {
				$("#num_error").html("Enter a valid telephone number")
				$("#num_error").show();
				$("#telephone").css("border", "1px solid #F90A0A");
			}
		}
		function check_country() {
			var reg_country = /^[a-zA-Z]*$/;
			var country = $("#country").val();
			if (!reg_country.test(country) || country == "") {
				$("#country_error").html(
						"Should contain only Characters and not empty")
				$("#country_error").show();
				$("#country").css("border", "1px solid #F90A0A");
			} else {
				$("#country_error").hide();
				$("#country").css("border", "2px solid #34F458");
			}
		}