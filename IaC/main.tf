terraform {
  required_providers {
    aws = {
      source  = "hashicorp/aws"
      version = "~> 4.16"
    }
  }

  required_version = ">= 1.2.0"
}

provider "aws" {
  profile = "default"
  region  = "us-east-1"
}

resource "aws_instance" "app_server" {
  ami           = "ami-016485166ec7fa705"
  instance_type = "t4g.small"
  key_name = "IaC-curso"
  #user_data = <<-EOF
  #           #!bin/bash
  #           cd home/ubuntu
  #           echo "<h1>feito pelo user data do terraform</h1>" > index.html
  #           nohop busybox httpd -f -p 8080
  #              EOF
  tags = {
    Name = "primeira-instancia-terraform"
  }
}
