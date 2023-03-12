import { ComponentFixture, TestBed } from '@angular/core/testing';

import { USERREGISTERComponent } from './userregister.component';

describe('USERREGISTERComponent', () => {
  let component: USERREGISTERComponent;
  let fixture: ComponentFixture<USERREGISTERComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ USERREGISTERComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(USERREGISTERComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
